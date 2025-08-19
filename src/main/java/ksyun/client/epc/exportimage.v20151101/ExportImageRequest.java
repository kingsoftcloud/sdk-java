package ksyun.client.epc.exportimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ExportImageRequest
* @Description 请求参数
*/
@Data
public class ExportImageRequest{
    /***/
    @KsYunField(name="ImageId")
    private String ImageId;

    /***/
    @KsYunField(name="Ks3Bucket")
    private String Ks3Bucket;

    /***/
    @KsYunField(name="ObjectName")
    private String ObjectName;

}