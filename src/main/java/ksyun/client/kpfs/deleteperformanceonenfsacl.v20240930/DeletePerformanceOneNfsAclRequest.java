package ksyun.client.kpfs.deleteperformanceonenfsacl.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeletePerformanceOneNfsAclRequest
* @Description 请求参数
*/
@Data
public class DeletePerformanceOneNfsAclRequest{
    /**规则ID。*/
    @KsYunField(name="NfsAclId")
    private String NfsAclId;

}
