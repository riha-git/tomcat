package tom;

import java.io.Serializable;

public class JspSrvBean implements Serializable
{
	private String name;
	private String kana;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setKana(String kana)
	{
		this.kana = kana;
	}
	
	public String getKana()
	{
		return kana;
	}
}
