[condition]标签输入模型的领域是"{value}"=tagModel: TagModel(domain=="{value}")
[consequence][]打印"{message}"=System.out.println("{message}");
[consequence][]添加标签"{newTag}"=tagModel.addTag("{newTag}");update(tagModel);