package ksyun.client.ked.roleslist.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RoleslistResponse
* @Description Roleslist 返回体
*/
@Data
@ToString
public class RoleslistResponse extends BaseResponseModel {
    /***/
    @JsonProperty("message")
    private String Message;

    /**成功为 200，其他错误码参考 http 状态码 其他错误码单独给出*/
    @JsonProperty("code")
    private Integer Code;

    /**请求唯一id错误时候显示到前端界面中*/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("pageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("pageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("totalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("records")
        private List<DataDtoRecordsDto> Records;

        @Data
        @ToString
        public static class DataDtoRecordsDto {
            /***/
            @JsonProperty("id")
            private Integer Id;

            /**创建时间*/
            @JsonProperty("createdAt")
            private String CreatedAt;

            /**角色名称*/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("description")
            private String Description;

            /**已绑定用户数量*/
            @JsonProperty("userNums")
            private Integer UserNums;

            /**远程文件权限:
0 禁用 
1 全部启用*/
            @JsonProperty("fileTransfer")
            private Integer FileTransfer;

            /**共享剪贴板权限:
0 禁用
1 全部启用*/
            @JsonProperty("clipboard")
            private Integer Clipboard;

            /**硬盘挂载:
0 禁用
1 开启*/
            @JsonProperty("disk")
            private Integer Disk;

            /**usb 挂载:
0 禁用 
1 开启*/
            @JsonProperty("usb")
            private Integer Usb;

        }

    }

}
