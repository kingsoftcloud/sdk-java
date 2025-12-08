package ksyun.client.trade.listinstancesupportbilltypes.v20250220;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstanceSupportBillTypesResponse
* @Description ListInstanceSupportBillTypes 返回体
*/
@Data
@ToString
public class ListInstanceSupportBillTypesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Error")
    private ErrorDto Error;

    @Data
    @ToString
    public static class ErrorDto {
        /**错误码*/
        @JsonProperty("Code")
        private String Code;

        /**错误详情*/
        @JsonProperty("Message")
        private String Message;

    }

    /**本次请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**计费方式英文名称*/
        @JsonProperty("billTypeEnName")
        private String BillTypeEnName;

        /**计费方式ID*/
        @JsonProperty("billTypeId")
        private Integer BillTypeId;

        /**计费方式中文名称*/
        @JsonProperty("billTypeName")
        private String BillTypeName;

    }

}
