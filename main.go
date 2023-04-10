package main

import "fmt"

func printAlph() {
	alph := []rune{'a', 'b', 'c', 'd', 'e'}
	for _, v := range alph {
		fmt.Println(v)
	}
}

func main() {
	printAlph()
}
