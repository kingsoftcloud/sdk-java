package ksyun.client.kpfs.deleteperformanceoneposixacl.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeletePerformanceOnePosixAclRequest
* @Description 请求参数
*/
@Data
public class DeletePerformanceOnePosixAclRequest{
    /**待删除POSIX访问授权规则ID*/
    @KsYunField(name="PosixAclId")
    private String PosixAclId;

}
