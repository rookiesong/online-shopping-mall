package net.suncaper.demo.domain;

import java.util.Arrays;
import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_mailaddress
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private String userMailaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pass_word
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private String passWord;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_phone
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private Long userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sex
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private Byte userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.build_day
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private Date buildDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.head
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    private byte[] head;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public User(String userMailaddress, String userName, String passWord, Long userPhone, Byte userSex, Date birthday, Date buildDay) {
        this.userMailaddress = userMailaddress;
        this.userName = userName;
        this.passWord = passWord;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.birthday = birthday;
        this.buildDay = buildDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public User(String userMailaddress, String userName, String passWord, Long userPhone, Byte userSex, Date birthday, Date buildDay, byte[] head) {
        this.userMailaddress = userMailaddress;
        this.userName = userName;
        this.passWord = passWord;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.birthday = birthday;
        this.buildDay = buildDay;
        this.head = head;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_mailaddress
     *
     * @return the value of user.user_mailaddress
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public String getUserMailaddress() {
        return userMailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_mailaddress
     *
     * @param userMailaddress the value for user.user_mailaddress
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setUserMailaddress(String userMailaddress) {
        this.userMailaddress = userMailaddress == null ? null : userMailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pass_word
     *
     * @return the value of user.pass_word
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pass_word
     *
     * @param passWord the value for user.pass_word
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_phone
     *
     * @return the value of user.user_phone
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public Long getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_phone
     *
     * @param userPhone the value for user.user_phone
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sex
     *
     * @return the value of user.user_sex
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public Byte getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sex
     *
     * @param userSex the value for user.user_sex
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.build_day
     *
     * @return the value of user.build_day
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public Date getBuildDay() {
        return buildDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.build_day
     *
     * @param buildDay the value for user.build_day
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setBuildDay(Date buildDay) {
        this.buildDay = buildDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.head
     *
     * @return the value of user.head
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public byte[] getHead() {
        return head;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.head
     *
     * @param head the value for user.head
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    public void setHead(byte[] head) {
        this.head = head;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserMailaddress() == null ? other.getUserMailaddress() == null : this.getUserMailaddress().equals(other.getUserMailaddress()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassWord() == null ? other.getPassWord() == null : this.getPassWord().equals(other.getPassWord()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getBuildDay() == null ? other.getBuildDay() == null : this.getBuildDay().equals(other.getBuildDay()))
            && (Arrays.equals(this.getHead(), other.getHead()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserMailaddress() == null) ? 0 : getUserMailaddress().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassWord() == null) ? 0 : getPassWord().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getBuildDay() == null) ? 0 : getBuildDay().hashCode());
        result = prime * result + (Arrays.hashCode(getHead()));
        return result;
    }
}