#### Git コミットメッセージ（description）の残し方

Gitでコミットを行う際通常メッセージをコミットのタイトルとするがdesctiptionを残す必要がありやり方がわからなかったため記述

⚪︎結論
&nbsp;&nbsp;コミットのコマンドの後ろに -m を追加で書く

```
$ git commit -m "commit Title" -m "commit Message"
```

&nbsp;&nbsp;これによりメッセージが残る

⚪︎参考記事
&nbsp;&nbsp;[git commit と Description部分の登録方法について](https://tyoshikawa1106.hatenablog.com/entry/2016/04/08/015920)