
	public class Student implements Comparable<Student>{
			private String name;
			private double gpa;
			private boolean graduate;

			public Student(String lastName, double gradePoint, String graduate){
				name = lastName;
				setGPA(gradePoint);
				if(graduate.equalsIgnoreCase("G")){
					this.graduate = true;
				}
				else
					this.graduate = false;
			}

			public void setGPA(double gpa){
				if(gpa > 4.0){
					gpa = 4.0;
				}
				else if(gpa < 0.0){
					gpa = 0.0;
				}
				else 
					this.gpa = gpa;
			}

			public boolean getGraduate(){
				return graduate;
			}

			public String getName(){
				return name;
			}

			public double getGPA(){
				return gpa;
			}


			public String toString(){
				String output = "Name: " + name + " GPA: " + gpa;
				if(graduate){
					output += "  Graduate Student";
				}
				else
					output += "  Undergraduate Student";
				return output;
			}

			@Override
			/*
			 * (non-Javadoc)
			 * @see java.lang.Comparable#compareTo(java.lang.Object)
			 * returns -1 if this student should be ordered before o
			 * returns 1 if this student should be ordered after o
			 * returns 0 if this student and o have no defined relative ordering
			 */
			public int compareTo(Student o) {
				//compare graduate vs. undergraduate
				if(this.graduate != o.getGraduate()){
					if(this.graduate == false){
						return -1;
					} else {
						return 1;
					}
				//compare GPA
				} else if(this.gpa != o.getGPA()){
					if(this.gpa < o.getGPA()){
						return 1;
					} else {
						return -1;
					}
				//compare name
				} else {
					return this.name.compareTo(o.getName());
				}
			}
		}

