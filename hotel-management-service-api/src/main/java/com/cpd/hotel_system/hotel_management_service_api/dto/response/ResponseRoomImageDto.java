package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomImageDto {
    private Long id;
    private String directory;
    private String filename;
    private String hash;
    private String resourceUrl;
    private String roomId;
}
