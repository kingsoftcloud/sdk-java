package ksyun.client.kpfs.addperformanceoneposixaclip.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddPerformanceOnePosixAclIpRequest
* @Description 请求参数
*/
@Data
public class AddPerformanceOnePosixAclIpRequest{
    /**POSIX访问授权规则ID*/
    @KsYunField(name="PosixAclId")
    private String PosixAclId;

    /**授权IP，支持单个/逗号分隔批量，单次最多100个IP*/
    @KsYunField(name="Ip")
    private String Ip;

}
