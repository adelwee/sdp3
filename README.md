# Design Patterns Assignment

This project contains examples of implementing various design patterns in Java. Each example demonstrates the application of a specific design pattern to solve a particular problem.

## Table of Contents

1. [Adapter Pattern - Audio Player](#adapter-pattern---audio-player)
2. [Bridge Pattern - Remote Control System](#bridge-pattern---remote-control-system)
3. [Composite Pattern - Menu System](#composite-pattern---menu-system)
4. [Decorator Pattern - Pizza Ordering System](#decorator-pattern---pizza-ordering-system)
5. [Facade Pattern - Smart Home System](#facade-pattern---smart-home-system)
6. [Flyweight Pattern - Text Editor](#flyweight-pattern---text-editor)
7. [Proxy Pattern - Online Learning Platform](#proxy-pattern---online-learning-platform)

## Adapter Pattern - Audio Player

### Description

The goal is to add support for playing WAV and AAC audio files to a music player that initially only supports MP3 files. This is achieved using the Adapter design pattern.

### Files
- `AudioPlayer.java` - Interface for playing audio.
- `MP3Player.java` - Implementation of an audio player that supports MP3 files.
- `WAVPlayer.java` and `AACPlayer.java` - Interfaces for playing WAV and AAC files.
- `AdvancedAudioPlayer.java` - Class for playing both WAV and AAC files.
- `AudioAdapter.java` - Adapter class that enables the `AudioPlayer` to use `AdvancedAudioPlayer`.
- `MusicPlayerApp.java` - Demonstrates the usage of the adapter to play different audio formats.

## Bridge Pattern - Remote Control System

### Description

The task is to design a universal remote control system that can work with various electronic devices (e.g., TV, DVD Player, Sound System) from different manufacturers. The Bridge design pattern is used to create a flexible system.

### Files
- `Device.java` - Interface with methods like `powerOn()`, `powerOff()`, `setChannel(int channel)`, `setVolume(int volume)`.
- `TVDevice.java`, `DVDDevice.java` - Concrete implementations for different devices.
- `RemoteControl.java` - Abstract class that references a `Device`.
- `BasicRemote.java`, `AdvancedRemote.java` - Concrete remote control classes with different levels of functionality.
- `HomeEntertainmentSystem.java` - Demonstrates how the same remote can work with different devices.

## Composite Pattern - Menu System

### Description

The goal is to build a restaurant menu system where a menu can contain individual menu items or other sub-menus. The Composite design pattern is used to represent the hierarchical structure.

### Files
- `MenuComponent.java` - Abstract class with methods like `getName()`, `getDescription()`, `getPrice()`, `print()`.
- `MenuItem.java` - Class representing individual dishes.
- `Menu.java` - Class that can contain `MenuComponent` objects (either `MenuItem` or other `Menu` objects).
- `RestaurantApp.java` - Demonstrates building a multi-level menu and printing it.

## Decorator Pattern - Pizza Ordering System

### Description

This task involves creating a flexible pizza ordering system where customers can customize their pizzas with various toppings. The Decorator design pattern is used to add toppings dynamically.

### Files
- `Pizza.java` - Interface with methods `getDescription()` and `getCost()`.
- `MargheritaPizza.java`, `VegetarianPizza.java` - Concrete classes representing basic pizza types.
- `ToppingDecorator.java` - Abstract class that implements `Pizza` and acts as a base for concrete decorators.
- `CheeseTopping.java`, `MushroomTopping.java` - Concrete decorators for various toppings.
- `PizzaShop.java` - Demonstrates the system, allowing for multiple toppings on a pizza.

## Facade Pattern - Smart Home System

### Description

The objective is to create a smart home system that controls various devices such as lights, thermostat, security system, and entertainment system. The Facade design pattern provides a simple interface for controlling the entire smart home.

### Files
- `Light.java`, `Thermostat.java`, `SecuritySystem.java`, `EntertainmentSystem.java` - Classes for individual smart devices.
- `SmartHomeFacade.java` - Encapsulates the interaction with all devices.
- `SmartHomeApp.java` - Demonstrates how the facade simplifies the control of the smart home.

## Flyweight Pattern - Text Editor

### Description

The task is to optimize a text editor that needs to render a large number of characters efficiently. The Flyweight design pattern is used to minimize memory usage by sharing common character objects.

### Files
- `Character.java` - Represents a character with intrinsic state (value, font, size).
- `CharacterFactory.java` - Manages character flyweights and ensures that identical characters share the same object.
- `TextCharacter.java` - Class for storing extrinsic state (position).
- `TextEditor.java` - Uses the `CharacterFactory` to insert and render text.
- `TextEditorApp.java` - Demonstrates the memory efficiency by inserting and rendering a large amount of text.

## Proxy Pattern - Online Learning Platform

### Description

The goal is to create an online learning platform where video lectures are only loaded when a student actually starts watching them. The Proxy design pattern is used to implement a virtual proxy for lazy loading.

### Files
- `VideoLecture.java` - Interface with methods `getInfo()` and `play()`.
- `RealVideoLecture.java` - Simulates loading and playing a video lecture.
- `ProxyVideoLecture.java` - Implements lazy loading; the real lecture is only loaded when `play()` is called for the first time.
- `OnlineCourse.java` - Contains multiple video lectures.
- `LearningPlatformApp.java` - Demonstrates how video lectures load only when played.




