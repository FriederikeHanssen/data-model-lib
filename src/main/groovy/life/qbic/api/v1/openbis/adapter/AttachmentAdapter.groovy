package life.qbic.api.v1.openbis.adapter

import life.qbic.api.v1.qbicobject.QbicAttachmentV1
import life.qbic.api.v1.qbicobject.QbicAttachmentFetchOptions
import life.qbic.api.v1.qbicobject.QbicPersonV1

interface AttachmentAdapter {

    byte[] getContent()

    String getDescription()

    QbicAttachmentFetchOptions getFetchOptions()

    String getFileName()

    String getLatestVersionPermlink()

    String getPermlink()

    QbicAttachmentV1 getPreviousVersion()

    Date getRegistrationDate()

    QbicPersonV1 getRegistrator()

    String getTitle()

    Integer getVersion()

}
