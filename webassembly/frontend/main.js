const go = new Go();
WebAssembly.instantiateStreaming(fetch('main.wasm'), go.importObject).then((result) => {
    go.run(result.instance)
    console.log(go)

    // Assuming GetAge is called after instantiation
});