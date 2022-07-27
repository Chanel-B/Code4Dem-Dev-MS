package com.home.welcome.modelEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WelcomeMessage extends BaseEntity{

     private String name;
     private String message;

}
