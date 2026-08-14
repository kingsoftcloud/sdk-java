package ksyun.client.aicp.checkklogservicestatus.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CheckKlogServiceStatusResponse
* @Description CheckKlogServiceStatus 返回体
*/
@Data
@ToString
public class CheckKlogServiceStatusResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**0: 用户状态正常
1: 欠费停服，可以部分使用控制台
2: 欠费关停，无法使用控制台，用户信息删除
3: 当前用用户不存在*/
    @JsonProperty("UserStatus")
    private Integer UserStatus;

    /***/
    @JsonProperty("UserId")
    private String UserId;

}
