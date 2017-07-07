/**
 * 
 */
package com.jgsudhakar.dto;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.jgsudhakar.dto.EmployeeDTO.java
 */
public class EmployeeDTO {
	private Integer id;
    private String firstName;
    private String lastName;
    private String designation;
 
    public EmployeeDTO(Integer id,String firstName,String lastName,String designation) 
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
    }
 
    public EmployeeDTO() {
        // TODO Auto-generated constructor stub
    }
 
    //Setters and Getters
    
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", designation=" + designation + "]";
    }

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
}
