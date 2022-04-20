package client.resourcemanager.deletefolder.v20210320;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteFolderRequest
* @Description 请求参数
*/
@Data
public class DeleteFolderRequest{
    /**资源夹ID*/
    @KsYunField(name="FolderId")
    private String FolderId;


}