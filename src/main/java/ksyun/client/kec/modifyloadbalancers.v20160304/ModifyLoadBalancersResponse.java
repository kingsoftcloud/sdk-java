package ksyun.client.kec.modifyloadbalancers.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyLoadBalancersResponse
* @Description ModifyLoadBalancers 返回体
*/
@Data
@ToString
public class ModifyLoadBalancersResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ModifyLoadBalancersResponse")
    private ModifyLoadBalancersResponseDto ModifyLoadBalancersResponse;

    @Data
    @ToString
    public static class ModifyLoadBalancersResponseDto {
        /***/
        @JsonProperty("request_id")
        private String Request_id;

        /***/
        @JsonProperty("return")
        private String ReturnField;

    }

}
