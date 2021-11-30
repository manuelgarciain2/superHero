package com.in2.superHeroe.SuperHeroe.payload;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ApiResponse {

    private Boolean status;
    private String message;
}
