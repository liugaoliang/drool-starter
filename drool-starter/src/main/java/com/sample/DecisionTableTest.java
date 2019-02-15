package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.liang.drool.TagModel;

/**
 * This is a sample class to launch a rule.
 */
public class DecisionTableTest {

    public static final void main(String[] args) {
        KieSession kSession = null;
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	kSession = kContainer.newKieSession("ksession-dtables");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
            System.out.println(message.getStatus());
            
            TagModel tag = new TagModel();
            tag.setDomain("港股");
            tag.setDateLength(4);
            tag.setDateType("WEEK");
            kSession.insert(tag);
            kSession.fireAllRules();
            System.out.println(tag.getTag());
            
            TagModel tag2 = new TagModel();
            tag2.setDomain("港股");
            tag2.setDateLength(10);
            tag2.setDateType("DAY");
            kSession.insert(tag2);
            kSession.fireAllRules();
            System.out.println(tag2.getTag());
            
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            kSession.destroy();
            kSession.dispose();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
