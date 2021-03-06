package com.cg.assignment.bean;
import javax.persistence.*;

	@Entity
	@Table(name="author_157980")
	public class Author 
	{
		@Id
		@SequenceGenerator(name="myseq", sequenceName="seq_author_id", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="myseq")
		@Column(name="authorid")
		private int authorId;
		
		@Column(name="firstName")
		private String firstName;
		
		@Column(name="middleName")
		private String middleName;
		
		@Column(name="lastName")
		private String lastName;
		
		@Column(name="phoneno")
		private String phoneNo;

		public int getAuthorId() {
			return authorId;
		}

		public void setAuthorId(int authorId) {
			this.authorId = authorId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		@Override
		public String toString() {
			return "Author ID : " + authorId + "\nName : " + firstName + " " + middleName + " " + lastName + "\nContact No : " + phoneNo;
		}
}
