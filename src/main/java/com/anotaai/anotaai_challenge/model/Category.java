package com.anotaai.anotaai_challenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;
}
