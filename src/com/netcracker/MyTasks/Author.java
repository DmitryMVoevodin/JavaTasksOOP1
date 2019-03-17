package com.netcracker.MyTasks;

public class Author {

    //Private Fields_______________________________________________________

    private String name;
    private String email;
    private char gender;

    //Public Methods_______________________________________________________

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Author[name=" + name + ", email=" + email + ", gender=" + gender + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Author)) return false;
        Author another = (Author) obj;
        return ((this.name.equals(another.name)) &&
                (this.email.equals(another.email)) &&
                (this.gender == another.gender));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + ((int)gender);
        return result;
    }

}