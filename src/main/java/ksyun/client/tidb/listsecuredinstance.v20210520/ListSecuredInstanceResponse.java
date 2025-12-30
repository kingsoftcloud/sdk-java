package ksyun.client.tidb.listsecuredinstance.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSecuredInstanceResponse
* @Description ListSecuredInstance 返回体
*/
@Data
@ToString
public class ListSecuredInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

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
        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**商品类型*/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /**商品类型名称*/
        @JsonProperty("ProductTypeName")
        private String ProductTypeName;

        /**绑定时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**tidb服务IP*/
        @JsonProperty("ClientIp")
        private String ClientIp;

        /**tidb服务端口*/
        @JsonProperty("ClientPort")
        private Integer ClientPort;

    }

}
