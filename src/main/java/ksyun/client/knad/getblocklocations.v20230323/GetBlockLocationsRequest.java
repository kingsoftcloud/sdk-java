package ksyun.client.knad.getblocklocations.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetBlockLocationsRequest
* @Description 请求参数
*/
@Data
public class GetBlockLocationsRequest{
    /***/
    @KsYunField(name="KnadId")
    private String KnadId;

}
