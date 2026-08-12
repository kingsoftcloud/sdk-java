package ksyun.client.kpfs.removeperformanceoneposixaclip.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemovePerformanceOnePosixAclIpRequest
* @Description 请求参数
*/
@Data
public class RemovePerformanceOnePosixAclIpRequest{
    /**POSIX访问授权规则ID*/
    @KsYunField(name="PosixAclId")
    private String PosixAclId;

    /**待移除IP，支持单个/逗号分隔批量，单次最多100个IP；移除后无IP则自动删除授权规则*/
    @KsYunField(name="Ip")
    private String Ip;

}
