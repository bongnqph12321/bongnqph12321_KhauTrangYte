USE [KhauTrangYTe]
GO
/****** Object:  Table [dbo].[acounts]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[acounts](
	[username] [varchar](50) NOT NULL,
	[age] [int] NULL,
	[fullname] [varchar](50) NULL,
	[gender] [bit] NULL,
	[password] [varchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[authorities]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[authorities](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](50) NULL,
	[roleid] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[categories]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[categories](
	[category_id] [int] IDENTITY(1,1) NOT NULL,
	[category_name] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[category_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[order_details]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order_details](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[price] [float] NOT NULL,
	[quantity] [int] NOT NULL,
	[order_id] [bigint] NULL,
	[product_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[orders]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orders](
	[order_id] [bigint] IDENTITY(1,1) NOT NULL,
	[address] [varchar](255) NULL,
	[create_date] [date] NULL,
	[username] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[order_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[products]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[products](
	[product_id] [int] IDENTITY(1,1) NOT NULL,
	[image] [varchar](200) NULL,
	[name] [nvarchar](100) NOT NULL,
	[price] [float] NOT NULL,
	[title] [nvarchar](500) NOT NULL,
	[category_id] [int] NULL,
	[quantity] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 12/18/2021 8:38:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[id] [varchar](255) NOT NULL,
	[name] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'admin', 20, N'Nguyen Van Oanh', 0, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'bongnqph12321', 23, N'Nguyen Quy Bong 123', 0, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'bongnqph12321@fpt.edu.vn', 20, N'bong nguyen quy', 1, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'bongnqph12321@gmail.com', 20, N'bong nguyen quy', 0, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'bongnqph19092001@fpt.edu.vn', 20, N'bong nguyen quy', 0, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'hatv12@gmail.com', 20, N'bong nguyen quy', 0, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'lytp1810@gmail.com', 22, N'Tran Phuong ly', 0, N'123')
INSERT [dbo].[acounts] ([username], [age], [fullname], [gender], [password]) VALUES (N'quybong2001@gmail.com', 21, N'bong nguyen quy', 0, N'123')
GO
SET IDENTITY_INSERT [dbo].[authorities] ON 

INSERT [dbo].[authorities] ([id], [username], [roleid]) VALUES (2, N'bongnqph12321', N'USER')
INSERT [dbo].[authorities] ([id], [username], [roleid]) VALUES (1, N'bongnqph12321@fpt.edu.vn', N'ADMIN')
INSERT [dbo].[authorities] ([id], [username], [roleid]) VALUES (3, N'bongnqph19092001@fpt.edu.vn', N'ADMIN')
SET IDENTITY_INSERT [dbo].[authorities] OFF
GO
SET IDENTITY_INSERT [dbo].[categories] ON 

INSERT [dbo].[categories] ([category_id], [category_name]) VALUES (1, N'KHẨU TRANG Y TẾ CAO CẤP')
INSERT [dbo].[categories] ([category_id], [category_name]) VALUES (2, N'KHẨU TRANG Y TẾ 4 LỚP')
INSERT [dbo].[categories] ([category_id], [category_name]) VALUES (3, N'KHẨU TRANG KHÁNG KHUẨN ')
INSERT [dbo].[categories] ([category_id], [category_name]) VALUES (4, N'KHẨU TRANG BỊCH')
INSERT [dbo].[categories] ([category_id], [category_name]) VALUES (1022, N'KHẨU TRANG Y TẾ 3M ')
SET IDENTITY_INSERT [dbo].[categories] OFF
GO
SET IDENTITY_INSERT [dbo].[order_details] ON 

INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (7, 45000, 1, 35, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (8, 55000, 1, 35, 2)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (9, 45000, 1, 36, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (10, 55000, 1, 36, 2)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (11, 65000, 1, 37, 1008)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (12, 45000, 1, 38, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (13, 55000, 2, 38, 2)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (14, 45000, 1, 39, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (15, 45000, 1, 39, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (16, 55000, 1, 39, 2)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (17, 45000, 1, 40, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (18, 45000, 1, 40, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (19, 45000, 1, 41, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (20, 45000, 1, 42, 1)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (21, 55000, 1, 42, 2)
INSERT [dbo].[order_details] ([id], [price], [quantity], [order_id], [product_id]) VALUES (22, 65000, 1, 42, 1015)
SET IDENTITY_INSERT [dbo].[order_details] OFF
GO
SET IDENTITY_INSERT [dbo].[orders] ON 

INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (35, N'Hà N?i', CAST(N'2021-12-16' AS Date), N'bongnqph12321@fpt.edu.vn')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (36, N'Nghia Huong Quoc Oai Ha Noi', CAST(N'2021-12-16' AS Date), N'bongnqph12321@fpt.edu.vn')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (37, N'Quoc Oai,Ha Noi', CAST(N'2021-12-16' AS Date), N'bongnqph19092001@fpt.edu.vn')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (38, N'Nghia Huong Quoc Oai Ha Noi', CAST(N'2021-12-16' AS Date), N'bongnqph12321@fpt.edu.vn')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (39, N'Hà N?i', CAST(N'2021-12-17' AS Date), N'bongnqph12321@fpt.edu.vn')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (40, N'Hà N?i', CAST(N'2021-12-17' AS Date), N'bongnqph12321@fpt.edu.vn')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (41, N'Hà N?i', CAST(N'2021-12-18' AS Date), N'quybong2001@gmail.com')
INSERT [dbo].[orders] ([order_id], [address], [create_date], [username]) VALUES (42, N'Ha Noi', CAST(N'2021-12-18' AS Date), N'bongnqph12321@fpt.edu.vn')
SET IDENTITY_INSERT [dbo].[orders] OFF
GO
SET IDENTITY_INSERT [dbo].[products] ON 

INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (1, N'https://i.ibb.co/wytC2z2/khautrang.png', N'Khẩu trang Y TẾ PROTECT FACIAL 5 LỚP ', 45000, N'Tên sản phẩm : Khẩu trang Y TẾ PROTECT FACIALGiá bán : Liên hệ đế biết giáThương hiệu : SEN VIỆTTình trạng : Còn hàngKhả năng cung cấp : Theo đơn hàng khách yêu cầuGiấy chứng nhận : TC ISO 13485:2016Hình thức thanh toán : Chuyển khoản | Tiền mặtSản xuất : CTY Vật Tư Y Tế Sen ViệtGợi ý việc dùng sản phẩm : Môi trường bụi, bẩn....', 1, 10)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (2, N'https://i.ibb.co/fH6rSM1/khautrang1.png', N'Khẩu trang SUPER PROTECT ( 4 LỚP)', 55000, N'Tên sản phẩm : Khẩu trang SUPER PROTECT ( 4 LỚP)
Giá bán : Liên hệ đế biết giá
Thương hiệu : VẬT TƯ Y TẾ SEN VIỆT
Tình trạng : Còn hàng
Khả năng cung cấp : Theo đơn hàng khách yêu cầu
Giấy chứng nhận : TC ISO 9001:2015
Hình thức thanh toán : Chuyển khoản | Tiền mặt
Sản xuất : CTY Vật Tư Y Tế Sen Việt
Gợi ý việc dùng sản phẩm : Môi trường bụi, bẩn....', 2, 20)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (1008, N'https://i.ibb.co/s5hzcrs/yte2.jpg', N'Khẩu trang PROTECT BLACK (KT Than)', 65000, N'Tên sản phẩm : Khẩu trang PROTECT BLACK (KT Than) Giá bán : Liên hệ đế biết giá Thương hiệu : VẬT TƯ Y TẾ SEN VIỆT Tình trạng : Còn hàng Khả năng cung cấp : Theo đơn hàng khách yêu cầu Giấy chứng nhận : TC ISO 9001:2015 Hình thức thanh toán : Chuyển khoản | Tiền mặt Sản xuất : CTY Vật Tư Y Tế Sen Việt Gợi ý việc dùng sản phẩm : Môi trường bụi, không khí ô nhiễm....', 3, 1000)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (1015, N'https://i.ibb.co/Q9q6xX6/yte4.jpg', N'Khẩu trang PROTECT CARBON (KT Than Carbon)', 65000, N'aaaa', 1, 1000)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (2013, N'https://i.ibb.co/yNCz819/yte7.jpg', N'Khẩu trang y tế kháng khuẩn Cacbon', 60000, N'kháng khuẩn', 3, 200)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (2015, N'https://i.ibb.co/1JbKTqW/yte5.jpg', N'KHẨU TRANG LUXURY PROTECT', 13000, N'KHẨU TRANG LUXURY PROTECT', 4, 180)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (2016, N'https://i.ibb.co/Sv6H87p/khau-Trang3m.jpg', N'Khẩu trang y tế 3M', 13000, N'Khẩu trang y tế 3M Tiện lợi', 1022, 300)
INSERT [dbo].[products] ([product_id], [image], [name], [price], [title], [category_id], [quantity]) VALUES (3020, N'https://i.ibb.co/yNCz819/yte7.jpg', N'KHẨU TRANG Y TẾ 4 LỚP', 65000, N'Khẩu trang y tế 4 lớp cao cấp', 1, 100)
SET IDENTITY_INSERT [dbo].[products] OFF
GO
INSERT [dbo].[roles] ([id], [name]) VALUES (N'ADMIN', N'bong nguyen quy')
INSERT [dbo].[roles] ([id], [name]) VALUES (N'USER', N'Nguyen Van Oanh')
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UKhtk0tjw6uf67w0vkhy5n3j1oq]    Script Date: 12/18/2021 8:38:25 PM ******/
ALTER TABLE [dbo].[authorities] ADD  CONSTRAINT [UKhtk0tjw6uf67w0vkhy5n3j1oq] UNIQUE NONCLUSTERED 
(
	[username] ASC,
	[roleid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UKjlqd4mk0gfr5nmxmsfl8aote4]    Script Date: 12/18/2021 8:38:25 PM ******/
ALTER TABLE [dbo].[authorities] ADD  CONSTRAINT [UKjlqd4mk0gfr5nmxmsfl8aote4] UNIQUE NONCLUSTERED 
(
	[username] ASC,
	[roleid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[products] ADD  CONSTRAINT [DF_Products_Image]  DEFAULT (N'Product.gif') FOR [image]
GO
ALTER TABLE [dbo].[products] ADD  CONSTRAINT [DF_Products_UnitPrice]  DEFAULT ((0)) FOR [price]
GO
ALTER TABLE [dbo].[authorities]  WITH CHECK ADD  CONSTRAINT [FK_UserRoles_Roles] FOREIGN KEY([roleid])
REFERENCES [dbo].[roles] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[authorities] CHECK CONSTRAINT [FK_UserRoles_Roles]
GO
ALTER TABLE [dbo].[authorities]  WITH CHECK ADD  CONSTRAINT [FKevi9708lm1k06pa4dugc91k7v] FOREIGN KEY([roleid])
REFERENCES [dbo].[roles] ([id])
GO
ALTER TABLE [dbo].[authorities] CHECK CONSTRAINT [FKevi9708lm1k06pa4dugc91k7v]
GO
ALTER TABLE [dbo].[authorities]  WITH CHECK ADD  CONSTRAINT [FKgr0a4qpxh7f51qv1vlva8w8g4] FOREIGN KEY([username])
REFERENCES [dbo].[acounts] ([username])
GO
ALTER TABLE [dbo].[authorities] CHECK CONSTRAINT [FKgr0a4qpxh7f51qv1vlva8w8g4]
GO
ALTER TABLE [dbo].[order_details]  WITH CHECK ADD  CONSTRAINT [FK4q98utpd73imf4yhttm3w0eax] FOREIGN KEY([product_id])
REFERENCES [dbo].[products] ([product_id])
GO
ALTER TABLE [dbo].[order_details] CHECK CONSTRAINT [FK4q98utpd73imf4yhttm3w0eax]
GO
ALTER TABLE [dbo].[order_details]  WITH CHECK ADD  CONSTRAINT [FKjyu2qbqt8gnvno9oe9j2s2ldk] FOREIGN KEY([order_id])
REFERENCES [dbo].[orders] ([order_id])
GO
ALTER TABLE [dbo].[order_details] CHECK CONSTRAINT [FKjyu2qbqt8gnvno9oe9j2s2ldk]
GO
ALTER TABLE [dbo].[orders]  WITH CHECK ADD  CONSTRAINT [FKc3m09xmam7bbvlfx2ou8061a] FOREIGN KEY([username])
REFERENCES [dbo].[acounts] ([username])
GO
ALTER TABLE [dbo].[orders] CHECK CONSTRAINT [FKc3m09xmam7bbvlfx2ou8061a]
GO
ALTER TABLE [dbo].[products]  WITH CHECK ADD  CONSTRAINT [FKog2rp4qthbtt2lfyhfo32lsw9] FOREIGN KEY([category_id])
REFERENCES [dbo].[categories] ([category_id])
GO
ALTER TABLE [dbo].[products] CHECK CONSTRAINT [FKog2rp4qthbtt2lfyhfo32lsw9]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Địa chỉ nhận' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'orders', @level2type=N'COLUMN',@level2name=N'address'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Mã khách hàng' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'orders', @level2type=N'COLUMN',@level2name=N'username'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Hình ảnh' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'products', @level2type=N'COLUMN',@level2name=N'image'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Tên hàng hóa' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'products', @level2type=N'COLUMN',@level2name=N'name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Đơn giá' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'products', @level2type=N'COLUMN',@level2name=N'price'
GO
