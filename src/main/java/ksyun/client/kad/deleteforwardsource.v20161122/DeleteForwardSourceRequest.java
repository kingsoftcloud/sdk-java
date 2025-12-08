package ksyun.client.kad.deleteforwardsource.v20161122;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteForwardSourceRequest
* @Description 请求参数
*/
@Data
public class DeleteForwardSourceRequest{
    /**四层转发源站配置的ID*/
    @KsYunField(name="ForwardSourceId")
    private String ForwardSourceId;

}
