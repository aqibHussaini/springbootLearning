package com.learning.demo.Entity;

import lombok.*;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor

@ToString
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter int id;
    private @Getter @Setter String name;
    private @Setter @Getter String description;
    private @Setter @Getter short priority; //1=high 2=low
    private @Setter @Getter short status; // 1 =done 0=pending
    private @Setter @Getter Date createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}