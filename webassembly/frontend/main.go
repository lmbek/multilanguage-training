//go:build js && wasm
// +build js,wasm

package main

import "fmt"

func main() {
	fmt.Println("hej")
}

//export GetAge
func GetAge() int {
	return 28
}
