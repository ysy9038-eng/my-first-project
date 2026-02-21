package vo;

public class PersonVo {

	String name;
	String nickname;
	String familyname;
	
	int		age;
	String	tel;
	String	hometel;
	
	public PersonVo() {
		super();
	}
	
	
	
	public PersonVo(String name, String nickname, String familyname, int age, String tel, String hometel) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.familyname = familyname;
		this.age = age;
		this.tel = tel;
		this.hometel = hometel;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getFamilyname() {
		return familyname;
	}
	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHometel() {
		return hometel;
	}
	public void setHometel(String hometel) {
		this.hometel = hometel;
	}
}
