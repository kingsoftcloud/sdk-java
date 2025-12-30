package ksyun.client.epc.describemanagedaccessory.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeManagedAccessoryResponse
* @Description DescribeManagedAccessory 返回体
*/
@Data
@ToString
public class DescribeManagedAccessoryResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ManagedAccessorySet")
    private List<ManagedAccessorySetDto> ManagedAccessorySet;

    @Data
    @ToString
    public static class ManagedAccessorySetDto {
        /***/
        @JsonProperty("SN")
        private String SN;

        /***/
        @JsonProperty("IDC")
        private String IDC;

        /***/
        @JsonProperty("Classification")
        private String Classification;

        /***/
        @JsonProperty("Model")
        private String Model;

        /***/
        @JsonProperty("Manufacturer")
        private String Manufacturer;

        /***/
        @JsonProperty("State")
        private String State;

        /***/
        @JsonProperty("Date")
        private String Date;

        /***/
        @JsonProperty("Source")
        private String Source;

        /***/
        @JsonProperty("Notes")
        private String Notes;

        /***/
        @JsonProperty("Num")
        private Integer Num;

        /**告警阈值*/
        @JsonProperty("AlarmNum")
        private Integer AlarmNum;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
