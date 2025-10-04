# blockoid

A thin Clojurescript wrapping of [Blockly](https://developers.google.com/blockly/), a library for building Scratch-like interfaces in the browser.

The combination of Blockly and Clojure allows for the easy creation of powerful combinatorial user interfaces and visual languages. See [this presentation](https://drive.google.com/file/d/1Jfc94u42BDqmwSFDazTplDfVjzc1eVej/view?usp=sharing) for a real-world example of use.

![screenshot](doc/image1.png)

## Usage

NOTE: I can't get the shadow-cljs include to work proeprly, so you also have to load blockly separately. Add these lines to your HTML frame:

    <script src="https://unpkg.com/blockly@12/blockly_compressed.js"></script>
    <script src="https://unpkg.com/blockly@12/blocks_compressed.js"></script>
    <script src="https://unpkg.com/blockly@12/msg/en.js"></script>

See [the example](example/project.clj) for details. 

In your code, add the `require`:

```clojure
(ns ...
  (:require ["blockoid" :as b]))
```

Usage details are in (a separate document)[doc/blockoid.md].

## License

Relased under MIT license. See the [LICENSE](LICENSE.md) file for details.

### One-time setup

    brew install npm
	npm install -g shadow-cljs

    npm install

### Building the librariy

    shadow-cljs compile lib

This writes results in target/blockoid.js and target/blockoid

### Installing for local use

    npm link
	
See here for other techniques: https://medium.com/@debshish.pal/publish-a-npm-package-locally-for-testing-9a00015eb9fd

I think npm pack might be worth trying

### Installing for global use

    
### Running example

    cd example
	npm link blockoid
    shadow-cljs compile app
	
TODO can't get a compile to work	
