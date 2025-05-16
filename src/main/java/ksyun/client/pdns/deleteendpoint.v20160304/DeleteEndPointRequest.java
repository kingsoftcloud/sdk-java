package ksyun.client.pdns.deleteendpoint.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteEndPointRequest
 * @Description 请求参数
 */
@Data
public class DeleteEndPointRequest {
    /**
     * EndPointId的ID
     */
    @KsYunField(name = "EndPointId")
    private String EndPointId;

}