SUMMARY = "E27radio"
DESCRIPTION = "Libao is a cross-platform audio library that allows programs to \
               output audio using a simple API on a wide variety of platforms."
SECTION = "multimedia"
HOMEPAGE = "https://github.com/jevontech/e27radio"
LICENSE = "CLOSED"


SRC_URI = "https://github.com/jevontech/e27radio/archive/0.1.zip;rev=0.1"
SRC_URI[md5sum] = "36a8284727d6c0f1b84ca6a92280160b"
SRC_URI[sha256sum] = "e55f70028a57b23c0689ab9dc95ab3d143f4a262f4e214b75fe4be8b9060f318"


inherit autotools  cmake_qt5


