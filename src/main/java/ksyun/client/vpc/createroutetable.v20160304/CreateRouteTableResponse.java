package ksyun.client.vpc.createroutetable.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateRouteTableResponse
* @Description CreateRouteTable 返回体
*/
@Data
@ToString
public class CreateRouteTableResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**路由表的信息*/
    @JsonProperty("RouteTable")
    private RouteTableDto RouteTable;

    @Data
    @ToString
    public static class RouteTableDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**路由表的ID*/
        @JsonProperty("RouteTableId")
        private String RouteTableId;

        /**路由表的名称*/
        @JsonProperty("RouteTableName")
        private String RouteTableName;

        /**路由表的描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**路由表的类型*/
        @JsonProperty("RouteTableType")
        private String RouteTableType;

    }

}
