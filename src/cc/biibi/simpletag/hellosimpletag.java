package cc.biibi.simpletag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

//ʵ�ʿ�����ֻ��Ҫ�̳�SimpleTagSupport
public class hellosimpletag implements SimpleTag {

	//jsp��ǩ���壨Ҫ��tld�ļ�����һ�£�
	private String value;
	private String count;
	public void setValue(String value) {
		this.value = value;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	//��ǩ���߼�ʵ��Ӧ�ñ�д���÷����С�
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("doTag");
		pageContext.getOut().print("HelloWorld!");//����������
		HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
		//��ȡ���������ַ�ϣ����������
		pageContext.getOut().print("hello"+request.getParameter("name"));
		System.out.println(value+"::"+count);
		
		JspWriter out = pageContext.getOut();
		int c = 0;
		c=Integer.parseInt(count);
		out.print("<br>");
		for(int i=0; i<c;i++){
			out.print(i+1+":"+"java");
			out.print("<br>");
		}
	}

	@Override
	public JspTag getParent() {
		System.out.println("getParent");
		return null;
	}

	@Override
	public void setJspBody(JspFragment arg0) {
		System.out.println("setJspBody");

	}

	private PageContext pageContext;//����һ��pageContext����
	//JSP������ã��Ѵ���JSPҳ���PageContext������
	//PageContext ���Ի�ȡjspҳ�������8����������
	//���Է���jspҳ��������ı�ǩ���������������
	@Override
	public void setJspContext(JspContext arg0) {
		System.out.println("setJspContext");
		System.out.println(arg0 instanceof PageContext);
		this.pageContext = (PageContext)arg0;//��ֵ
	}

	@Override
	public void setParent(JspTag arg0) {
		System.out.println("setParent");

	}

}
