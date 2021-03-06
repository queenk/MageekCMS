package cn.mageek.pojo;

import javax.persistence.*;

//NamedQuery查询
@Entity // 会自动生成该table
@NamedQuery(name = "Person.findByNameAndAddress",
query = "select p from Person p where p.name=?1 and address=?2")
public class Person {
	@Id //2 主键
	@GeneratedValue //3 自增
	private Long id;

    @Column(nullable = false)
    private String name;
	
	private Integer age;
	
	private String address;

	public Person() {
		super();
	}
	public Person(Long id, String name, Integer age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
