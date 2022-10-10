package com.example.webspring.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sessions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer session_id;

    private String session_name;

    public Integer getId() {
        return session_id;
    }

    public void setId(Integer id) {
        this.session_id = id;
    }

    public String getName() {
        return session_name;
    }

    public void setName(String name) {
        this.session_name = name;
    }
}
