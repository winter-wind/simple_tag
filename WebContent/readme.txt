1.新建一个标签类实现simpleTag
2.在web-inf下新建个.tld标签库描述文件并复制固定部分
	对description,display-name,tlib-version,short-name,uri做出修改
3.在tld文件中描述自定义的标签


4.在jsp页面上使用自定义标签
	使用taglib指令导入标签库描述文件
	使用自定义的标签