package ksyun.client.tidb.listunsecuredinstance.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListUnsecuredInstanceResponse
* @Description ListUnsecuredInstance 返回体
*/
@Data
@ToString
public class ListUnsecuredInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /***/
        @JsonProperty("ProductTypeName")
        private String ProductTypeName;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("ClientIp")
        private String ClientIp;

        /***/
        @JsonProperty("ClientPort")
        private Integer ClientPort;

    }

}
