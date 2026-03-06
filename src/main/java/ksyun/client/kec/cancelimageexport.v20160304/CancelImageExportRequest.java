package ksyun.client.kec.cancelimageexport.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelImageExportRequest
* @Description 请求参数
*/
@Data
public class CancelImageExportRequest{
    /**正在导出的镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

}
