package ksyun.client.monitor.putdefaulteventpolicy.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname PutDefaultEventPolicyRequest
* @Description 请求参数
*/
@Data
public class PutDefaultEventPolicyRequest{
    /**告警策略名称。*/
    @KsYunField(name="PolicyName")
    private String PolicyName;

}
