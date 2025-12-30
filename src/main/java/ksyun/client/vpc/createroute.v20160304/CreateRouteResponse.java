package ksyun.client.vpc.createroute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateRouteResponse
* @Description CreateRoute 返回体
*/
@Data
@ToString
public class CreateRouteResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**路由的ID*/
    @JsonProperty("RouteId")
    private String RouteId;

    /**下一跳类型*/
    @JsonProperty("RouteType")
    private String RouteType;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**Vpc的ID*/
    @JsonProperty("VpcId")
    private String VpcId;

    /**目标网段*/
    @JsonProperty("DestinationCidrBlock")
    private String DestinationCidrBlock;

    /**是否是系统路由*/
    @JsonProperty("System")
    private Boolean System;

    /**描述信息*/
    @JsonProperty("Description")
    private String Description;

    /**路由表ID*/
    @JsonProperty("RouteTableId")
    private String RouteTableId;

    /**类型*/
    @JsonProperty("RouteEntryType")
    private String RouteEntryType;

}
