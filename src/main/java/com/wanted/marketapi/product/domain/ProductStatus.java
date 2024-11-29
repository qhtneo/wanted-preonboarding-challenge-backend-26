package com.wanted.marketapi.product.domain;
//
//import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ProductStatus {
//    @SerializedName(value = "forSale")
    FOR_SALE, // 판매중
//    @SerializedName(value = "reserved")
    RESERVED, // 예약중
//    @SerializedName(value = "sold")
    SOLD // 완료
}
