package com.bahhar.kafka.entities;


import lombok.*;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class PageEvent {
        private String name;
        private String user;
        private Date date;
        private long duration;  // en ms
}
