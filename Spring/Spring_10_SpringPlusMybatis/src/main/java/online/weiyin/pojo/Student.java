package online.weiyin.pojo;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_id
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    private Integer studentId;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", clazzId=" + clazzId +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_name
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.clazz_id
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    private Integer clazzId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_id
     *
     * @return the value of t_student.student_id
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_id
     *
     * @param studentId the value for t_student.student_id
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_name
     *
     * @return the value of t_student.student_name
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_name
     *
     * @param studentName the value for t_student.student_name
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.clazz_id
     *
     * @return the value of t_student.clazz_id
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    public Integer getClazzId() {
        return clazzId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.clazz_id
     *
     * @param clazzId the value for t_student.clazz_id
     *
     * @mbg.generated Wed Jan 11 10:53:49 CST 2023
     */
    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }
}