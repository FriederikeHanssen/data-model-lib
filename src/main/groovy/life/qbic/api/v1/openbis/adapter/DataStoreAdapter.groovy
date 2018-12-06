package life.qbic.api.v1.openbis.adapter

interface DataStoreAdapter {

    String getCode()

    String getDownloadUrl()

    DataStoreFetchOptionsAdapter getFetchOptions()

    Date getModificationDate()

    Date getRegistrationDate()

    String getRemoteUrl()

}