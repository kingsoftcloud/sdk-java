package ksyun.client.kpfs.describeclientinstallinfo.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClientInstallInfoRequest
* @Description 请求参数
*/
@Data
public class DescribeClientInstallInfoRequest{
    /**文件系统的实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
