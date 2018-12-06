package life.qbic.api.v1.openbis.adapter

interface PhysicalDataAdapter {

    CompleteAdapter getComplete()

    PhysicalDataFetchOptionsAdapter getFetchOptions()

    String getLocation()

    LocatorTypeAdapter getLocatorType()

    String getShareId()

    long getSize()

    int getSpeedHint()

    ArchivingStatusAdapter getStatus()

    StorageFormatAdapter getStorageFormat()

    boolean isArchivingRequested()

    boolean isPresentInArchive()

    boolean isStorageConfirmation()
}