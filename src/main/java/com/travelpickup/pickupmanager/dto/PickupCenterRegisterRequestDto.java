package com.travelpickup.pickupmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PickupCenterRegisterRequestDto {

    @NotBlank(message = "값이 비어있을 수 없습니다.")
    private String name;

    @NotBlank(message = "값이 비어있을 수 없습니다.")
    private String address;

    @NotBlank(message = "값이 비어있을 수 없습니다.")
    private String addressDetail;

    @NotNull(message = "값이 null일 수 없습니다.")
    @PositiveOrZero(message = "값은 0 이상이어야 합니다.")
    private Double latitude;

    @NotNull(message = "값이 null일 수 없습니다.")
    @PositiveOrZero(message = "값은 0 이상이어야 합니다.")
    private Double longitude;

}
