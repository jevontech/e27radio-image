# E27radio : Intel Edison image using bitbake

## Introduction
This git archive can be used to build an image for Intel Edison, specifically for use with the "E27radio" project

## Differences compared to default Intel Edison image
This git archive is based on the default Intel Edison source with the following modifications:

## New layers
meta-qt5: https://github.com/meta-qt5/meta-qt5
meta-e27: new layer specifically for this project

## What is in layer meta-e27 ?

extra packages:
* audiofile: Audio File Library
* mpg123: mp3 player ( inspired by recipe at https://github.com/alext-mkrs/meta-alext-edison)
* Poco: C++ library  ( recipe from https://github.com/bmwcarit/meta-ros)

## Other modifications
modified Bitbake recipe:
* edison-image: add extra packages and increase image size

## How to build
Use the makefile as provided:

1. Run 'make setup'
2. Run 'make edison-image'  <-- this will take a LONG time and diskspace

